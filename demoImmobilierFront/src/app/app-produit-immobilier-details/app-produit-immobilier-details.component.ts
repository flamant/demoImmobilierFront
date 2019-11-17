import { Component, OnInit } from '@angular/core';
import {DossierPinelDTO} from './../dossier-pinel-dto';
import { ActivatedRoute } from '@angular/router';
import {AppServiceService} from './../app-service.service';



@Component({
  selector: 'app-app-produit-immobilier-details',
  templateUrl: './app-produit-immobilier-details.component.html',
  styleUrls: ['./app-produit-immobilier-details.component.scss']
})
export class AppProduitImmobilierDetailsComponent implements OnInit {

  public annonce: DossierPinelDTO;
  public id: number;
  public open1 = false;
  public open2 = false;
  public open3 = false;

  public slides = [
    {
      url: '../../assets/image/image1_1.jpg'
    },
    {
      url: '../../assets/image/image1_2.jpg'
    },
    {
      url: '../../assets/image/image1_3.jpg'
    },
    {
      url: '../../assets/image/image1_4.jpg'
    },
    {
      url: '../../assets/image/image1_5.jpg'
    },
    {
      url: '../../assets/image/image1_6.jpg'
    },
    {
      url: '../../assets/image/image1_7.jpg'
    },
    {
      url: '../../assets/image/image1_8.jpg'
    }
  ];

  public numberOfImages = 8;
  public images = [];
  public imagesText = [
    {
      orderLo: 'first',
      orderUp: 'First',
      comment: 'first comment'
    },
    {
      orderLo: 'second',
      orderUp: 'Second',
      comment: 'second comment'
    },
    {
      orderLo: 'third',
      orderUp: 'Third',
      comment: 'third comment'
    },
    {
      orderLo: 'fourth',
      orderUp: 'Fourth',
      comment: 'fourth comment'
    },
    {
      orderLo: 'fifth',
      orderUp: 'Fifth',
      comment: 'fifth comment'
    },
    {
      orderLo: 'sixth',
      orderUp: 'Sixth',
      comment: 'sixth comment'
    },
    {
      orderLo: 'seventh',
      orderUp: 'Seventh',
      comment: 'seventh comment'
    },
    {
      orderLo: 'eighth',
      orderUp: 'Eighth',
      comment: 'eighth comment'
    },
    {
      orderLo: 'ninth',
      orderUp: 'Ninth',
      comment: 'ninth comment'
    },
    {
      orderLo: 'tenth',
      orderUp: 'Tenth',
      comment: 'tenth comment'
    }
  ];

  constructor(private activatedRoute: ActivatedRoute, private service: AppServiceService) { }

  ngOnInit() {
      for (let i = 0; i < this.numberOfImages; i++) {
          this.images[i] = this.imagesText[i];
      }
      this.id = +this.activatedRoute.snapshot.paramMap.get('id');
      console.log('ngOnInit details  this.id=' + this.id);
      this.service.getDossierPinelDTO(this.id).subscribe(
        article => this.annonce = article
      );
  }

  displayOrientation(annonce) {
    let result = '';
    if (annonce.produitImmobilierDTO.orientation === 'N') {
        result = 'Nord';
    }
    if (annonce.produitImmobilierDTO.orientation === 'O') {
        result = 'Ouest';
    }
    if (annonce.produitImmobilierDTO.orientation === 'E') {
        result = 'Est';
    }
    if (annonce.produitImmobilierDTO.orientation === 'S') {
        result = 'Sud';
    }
    if (annonce.produitImmobilierDTO.orientation === 'NO') {
        result = 'Nord Ouest';
    }
    if (annonce.produitImmobilierDTO.orientation === 'NE') {
        result = 'Nord Est';
    }
    if (annonce.produitImmobilierDTO.orientation === 'SO') {
        result = 'Sud Ouest';
    }
    if (annonce.produitImmobilierDTO.orientation === 'SE') {
        result = 'Sud Est';
    }
    return result;
  }
}
