import { DossierPinelDTO } from './dossier-pinel-dto';
import { ProduitImmobilierDTO } from './produit-immobilier-dto';
import { ResultatLoiPinelDTO } from './resultat-loi-pinel-dto';

describe('DossierPinelDTO', () => {
  it('should create an instance', () => {
    const produitImmobilierDTO = ProduitImmobilierDTO.fromJson(
        { id: 1,
          type: 'Appartement',
          telephone: '0622136822',
          nbrLots: '1',
          isParking: true,
          isLift: false,
          dpe: 'dpe1',
          chargesCoprop: 100,
          taxeFonciaire: '101',
          dateConstruction: new Date('2019-10-21T00:00:00'),
          adresse: 'Paris 15ème',
          description: 'C’est idéalement situé au 27 quai' +
                       'de Grenelle que Flatlooker vous' +
                        'propose aujourd’hui ce trois' +
                        'pièces d’exception au 5ème étage...',
          prix: 2300,
          surface: '4 p . 2 ch . 70m2',
          surfaceBalcon: 104,
          surfaceTerrasse: 105,
          surfaceVerandas: 106,
          surfaceSousSol: 107,
          surfaceCave: 108,
          surfaceLogias: 109,
          autreSurfaceAnnexe: 110
        });
    const resultatLoiPinelDTO =  ResultatLoiPinelDTO.fromJson(
        { loyerMaximum: 2300,
          reductionImpots6ans: 30,
          reductionImpots9ans: 20,
          reductionImpots12ans: 10
        });
    expect(new DossierPinelDTO(produitImmobilierDTO, resultatLoiPinelDTO)).toBeTruthy();
  });
});
