package com.example.demoImmobilierBack.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demoImmobilierBack.dto.Search;
import com.example.demoImmobilierBack.model.ProduitImmobilier;

@Service
@Qualifier("search")
class ProduitImmobilierCritRepositoryImpl implements ProduitImmobilierCritRepositoryCustom { 

    @PersistenceContext
    private EntityManager em;


    public List<ProduitImmobilier> findBySearch(Search search) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<ProduitImmobilier> query = builder.createQuery(ProduitImmobilier.class);
		Root<ProduitImmobilier> root = query.from(ProduitImmobilier.class);
		List<Predicate> predicates = new ArrayList<>();
		if (search.getType() != null) {
			predicates.add(builder.equal(root.get("type"), search.getType()));
		}
		if (search.getIsParking() != null && (search.getIsParking().equals(new Integer(0))  || search.getIsParking().equals(new Integer(1)))) {
			predicates.add(builder.equal(root.get("isParking"), search.getIsParking().equals(new Integer(0)) ? new Boolean(false) : new Boolean(true)));
		}
		if (search.getIsLift() != null && (search.getIsLift().equals(new Integer(0))  || search.getIsLift().equals(new Integer(1)))) {
			predicates.add(builder.equal(root.get("isLift"), search.getIsLift().equals(new Integer(0)) ? new Boolean(false) : new Boolean(true)));
		}
		if (search.getIsGardien() != null && (search.getIsGardien().equals(new Integer(0))  || search.getIsGardien().equals(new Integer(1)))) {
			predicates.add(builder.equal(root.get("isGardien"), search.getIsGardien().equals(new Integer(0)) ? new Boolean(false) : new Boolean(true)));
		}		
		if (search.getIsCheminee() != null && (search.getIsCheminee().equals(new Integer(0))  || search.getIsCheminee().equals(new Integer(1)))) {
			predicates.add(builder.equal(root.get("isCheminee"), search.getIsCheminee().equals(new Integer(0)) ? new Boolean(false) : new Boolean(true)));
		}	
		if (search.getNbrPieceMin() != null) {
			predicates.add(builder.ge(root.get("nbr_piece"), search.getNbrPieceMin()));
		}
		if (search.getNbrPieceMax() != null) {
			predicates.add(builder.le(root.get("nbr_piece"), search.getNbrPieceMax()));
		}
		if (search.getNbrChambreMin() != null) {
			predicates.add(builder.ge(root.get("nbr_chambre"), search.getNbrChambreMin()));
		}
		if (search.getNbrChambreMax() != null) {
			predicates.add(builder.le(root.get("nbr_chambre"), search.getNbrChambreMax()));
		}
		if (search.getDateMiseEnLigneMin() != null) {
			predicates.add(builder.greaterThanOrEqualTo(root.get("dateMiseEnLigne"), new Date(search.getDateMiseEnLigneMin())));
		}
		if (search.getDateMiseEnLigneMax() != null) {
			predicates.add(builder.lessThanOrEqualTo(root.get("dateMiseEnLigne"), new Date(search.getDateMiseEnLigneMax())));
		}
		if (search.getDateConstructionMin() != null) {
			predicates.add(builder.greaterThanOrEqualTo(root.get("dateConstruction"), new Date(search.getDateConstructionMin())));
		}
		if (search.getDateMiseEnLigneMax() != null) {
			predicates.add(builder.lessThanOrEqualTo(root.get("dateConstruction"), new Date(search.getDateMiseEnLigneMax())));
		}
		if (search.getCodePostal() != null) {
			predicates.add(builder.equal(root.get("codePostal"), search.getCodePostal()));
		}
		if (search.getVille() != null) {
			predicates.add(builder.equal(root.get("ville"), search.getVille()));
		}
		if (search.getPrixMin() != null) {
			predicates.add(builder.ge(root.get("prix"), search.getPrixMin()));
		}
		if (search.getPrixMax() != null) {
			predicates.add(builder.le(root.get("prix"), search.getPrixMax()));
		}
		if (search.getSurfaceMin() != null) {
			predicates.add(builder.ge(root.get("surface"), search.getSurfaceMin()));
		}
		if (search.getSurfaceMax() != null) {
			predicates.add(builder.le(root.get("surface"), search.getSurfaceMax()));
		}	
		query.where(predicates.toArray(new Predicate[0]));
		return em.createQuery(query).getResultList();
	}
}
