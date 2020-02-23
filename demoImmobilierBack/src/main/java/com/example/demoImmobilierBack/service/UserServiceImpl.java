package com.example.demoImmobilierBack.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.demoImmobilierBack.dto.ProduitImmobilierDTO;
import com.example.demoImmobilierBack.dto.UserDTO;
import com.example.demoImmobilierBack.model.ProduitImmobilier;
import com.example.demoImmobilierBack.model.User;
import com.example.demoImmobilierBack.repository.ProduitImmobilierRepository;
import com.example.demoImmobilierBack.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	public static final Pattern VALID_PASSWORD_REGEX = 
		    Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&].{8,}");
	
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private ProduitImmobilierService produitImmobilierService;
	
	public UserDTO findByEmailAndPassword(String email, String password) {
		User user = userRepository.findByEmailAndPassword(email, password);
		return convertUserToUserDTO(user);
	}
	
	public UserDTO save(UserDTO userDTO) {
		User user = userRepository.save(convertUserDTOToUser(userDTO));
		return convertUserToUserDTO(user);
	}
	
	public String checkEmailAndPasswordAndPasswordConfirm(UserDTO userDTO) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(userDTO.getEmail());
		if (!matcher.find()) {
			return "L'email que vous avez fourni: " + userDTO.getEmail() + " n'est pas valide";
		}
		User user = userRepository.findByEmail(userDTO.getEmail());
		if (user != null) {
			return "L'utilisateur avec l'email suivant " + userDTO.getEmail() + " existe déjà";
		}
		matcher = VALID_PASSWORD_REGEX .matcher(userDTO.getPassword());
		if (!matcher.find()) {
			return "Le mot de passe que vous avez fourni: " + userDTO.getPassword() + " n'est pas valide. Il doit contenir au moins 8 caractères, un caractère minuscule, un caractère majuscule, un chiffre et un caractère spécial.";
		}
		if (!userDTO.getPassword().equals(userDTO.getPasswordConfirm())) {
			return "Le mot de passe que vous avez fourni: " + userDTO.getPassword() + " ne correspond pas à la confirmation du mot de passe  " + userDTO.getPasswordConfirm();
		}
		return "";
	}
	
	public String checkIfUserExistsAndGoodCredential(UserDTO userDTO) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(userDTO.getEmail());
		if (!matcher.find()) {
			return "L'email que vous avez fourni: " + userDTO.getEmail() + " n'est pas valide";
		}
		User user = userRepository.findByEmail(userDTO.getEmail());
		if (user == null) {
			return "L'utilisateur avec l'email suivant " + userDTO.getEmail() + " n'existe pas";
		}
		matcher = VALID_PASSWORD_REGEX .matcher(userDTO.getPassword());
		if (!matcher.find()) {
			return "Le mot de passe que vous avez fourni: " + userDTO.getPassword() + " n'est pas valide. Il doit contenir au moins 8 caractères, un caractère minuscule, un caractère majuscule, un chiffre et un caractère spécial.";
		}
		user = userRepository.findByEmailAndPassword(userDTO.getEmail(), userDTO.getPassword());
		if (user == null) {
			return "L'utilisateur avec l'email suivant " + userDTO.getEmail() + " et le mot de passe suivant " + userDTO.getPassword() + "n'existe pas";
		}	
		return "";
	}
	
	public UserDTO convertUserToUserDTO(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setGender(user.getGender());
		userDTO.setLastName(user.getLastName());
		userDTO.setEmail(user.getEmail());
		userDTO.setPassword(user.getPassword());
		userDTO.setMobileTelephone(user.getFixedTelephone());
		userDTO.setFixedTelephone(user.getFixedTelephone());
		userDTO.setAdress(user.getAdress());
		userDTO.setPostalCode(user.getPostalCode());
		userDTO.setTown(user.getTown());
		userDTO.setProfession(user.getProfession());
		userDTO.setProfile(user.getProfile());
		userDTO.setMaritalSituation(user.getMaritalSituation());
		userDTO.setChildrenNumber(user.getChildrenNumber());
		userDTO.setDependant(user.getDependant());
		userDTO.setOwnedOrRentedAccommodation(user.getOwnedOrRentedAccommodation());
		userDTO.setMonthlyNetSalary(user.getMonthlyNetSalary());
		userDTO.setRentAmount(user.getRentAmount());
		userDTO.setBankLoan(user.getIsBankLoan() ? new Byte((byte)1) : new Byte((byte)0));
		userDTO.setCapitalContribution(user.getCapitalContribution());
		userDTO.setCreditAmount(user.getCreditAmount());
		userDTO.setMonthlyPayment(user.getMonthlyPayment());
		userDTO.setCreditTerminationDate(user.getCreditTerminationDate());
		userDTO.setSIRETNumber(user.getSIRETNumber());
		
		Set<ProduitImmobilier> setProduitImmobiliers = user.getRealEstateProperty();
		List<ProduitImmobilierDTO> setProduitImmobilierDTOs = new ArrayList<>();
		
		setProduitImmobiliers.forEach(p ->{ ProduitImmobilierDTO pDTO = produitImmobilierService.convertProduitImmobilierToProduitImmobilierDTO(p, setProduitImmobiliers.size()); setProduitImmobilierDTOs.add(pDTO);});

		Comparator<ProduitImmobilierDTO> compareByIdDesc = new Comparator<ProduitImmobilierDTO>() {
		    @Override
		    public int compare(ProduitImmobilierDTO o1, ProduitImmobilierDTO o2) {
		        return o2.getId().compareTo(o1.getId());
		    }
		};
		Collections.sort(setProduitImmobilierDTOs, compareByIdDesc);
		userDTO.setRealEstateProperty(setProduitImmobilierDTOs);
		return userDTO;
	}
	
	public User convertUserDTOToUser(UserDTO userDTO) {
		User user = new User();
		user.setId(userDTO.getId());
		user.setGender(userDTO.getGender());
		user.setLastName(userDTO.getLastName());
		user.setEmail(userDTO.getEmail());
		user.setPassword(userDTO.getPassword());
		user.setMobileTelephone(userDTO.getFixedTelephone());
		user.setFixedTelephone(userDTO.getFixedTelephone());
		user.setAdress(userDTO.getAdress());
		user.setPostalCode(userDTO.getPostalCode());
		user.setTown(userDTO.getTown());
		user.setProfession(userDTO.getProfession());
		user.setProfile(userDTO.getProfile());
		user.setMaritalSituation(userDTO.getMaritalSituation());
		user.setChildrenNumber(userDTO.getChildrenNumber());
		user.setDependant(userDTO.getDependant());
		user.setOwnedOrRentedAccommodation(userDTO.getOwnedOrRentedAccommodation());
		user.setMonthlyNetSalary(userDTO.getMonthlyNetSalary());
		user.setRentAmount(userDTO.getRentAmount());
		user.setIsBankLoan((userDTO.getBankLoan().equals(new Byte((byte) 0))) ? false : userDTO.getBankLoan().equals(new Byte((byte) 1)) ? true : null  );
		user.setCapitalContribution(userDTO.getCapitalContribution());
		user.setCreditAmount(userDTO.getCreditAmount());
		user.setMonthlyPayment(userDTO.getMonthlyPayment());
		user.setCreditTerminationDate(new Date(userDTO.getCreditTerminationDate()));
		user.setSIRETNumber(userDTO.getSIRETNumber());
		return user;
	}

}
