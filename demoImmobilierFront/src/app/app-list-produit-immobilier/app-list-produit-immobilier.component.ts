import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import {ProduitImmobilierDTO} from './../produit-immobilier-dto';
import {AppServiceService} from './../app-service.service';
import { Router } from '@angular/router';
import { HttpErrorResponse } from '@angular/common/http';
import { ResultatLoiPinelDTO } from '../resultat-loi-pinel-dto';
import { VariablesGlobales } from './../variablesGlobales';
import {MatDialog, MatDialogConfig, DialogPosition} from "@angular/material";
import { UserDialogComponent } from '../user-dialog/user-dialog.component';
import {VERSION} from '@angular/material';
import {NavItem} from './../nav-item';
import {GlobalService} from './../global.service'
import { Search } from '../search';
import { Observable, of } from 'rxjs';
import { tap, map } from 'rxjs/operators';

declare var $: any;

@Component({
  selector: 'app-app-list-produit-immobilier',
  templateUrl: './app-list-produit-immobilier.component.html',
  styleUrls: ['./app-list-produit-immobilier.component.scss'],
  providers: [GlobalService],
  encapsulation: ViewEncapsulation.None
})
export class AppListProduitImmobilierComponent implements OnInit {

  public annonces$: Observable<ProduitImmobilierDTO[]> = new Observable<ProduitImmobilierDTO[]>();
  public annonces: ProduitImmobilierDTO[];
  public pageSize = 5;
  public page = 1;
  public collectionSize: number;
  public lat: number;
  public lng: number;
  public geocoder: google.maps.Geocoder;
  public postalCode: string;
  public global: VariablesGlobales;
  
  public version = VERSION;
  public navItems: NavItem[] = [
    {
      displayName: 'DevFestFL',
      iconName: 'group',
      children: [
        {
          displayName: 'Speakers',
          iconName: 'group',
          children: [
            {
              displayName: 'Michael Prentice',
              iconName: 'person',
              route: 'michael-prentice',
              children: [
                {
                  displayName: 'Create Enterprise UIs',
                  iconName: 'star_rate',
                  route: 'material-design'
                }
              ]
            },
            {
              displayName: 'Stephen Fluin',
              iconName: 'person',
              route: 'stephen-fluin',
              children: [
                {
                  displayName: 'What\'s up with the Web?',
                  iconName: 'star_rate',
                  route: 'what-up-web'
                }
              ]
            },
            {
              displayName: 'Mike Brocchi',
              iconName: 'person',
              route: 'mike-brocchi',
              children: [
                {
                  displayName: 'My ally, the CLI',
                  iconName: 'star_rate',
                  route: 'my-ally-cli'
                },
                {
                  displayName: 'Become an Angular Tailor',
                  iconName: 'star_rate',
                  route: 'become-angular-tailer'
                }
              ]
            }
          ]
        },
        {
          displayName: 'Sessions',
          iconName: 'speaker_notes',
          children: [
            {
              displayName: 'Create Enterprise UIs',
              iconName: 'star_rate',
              route: 'material-design'
            },
            {
              displayName: 'What\'s up with the Web?',
              iconName: 'star_rate',
              route: 'what-up-web'
            },
            {
              displayName: 'My ally, the CLI',
              iconName: 'star_rate',
              route: 'my-ally-cli'
            },
            {
              displayName: 'Become an Angular Tailor',
              iconName: 'star_rate',
              route: 'become-angular-tailer'
            }
          ]
        },
        {
          displayName: 'Feedback',
          iconName: 'feedback',
          route: 'feedback'
        }
      ]
    },
    {
      displayName: 'Disney',
      iconName: 'group',
      children: [
        {
          displayName: 'Speakers',
          iconName: 'group',
          children: [
            {
              displayName: 'Michael Prentice',
              iconName: 'person',
              route: 'michael-prentice',
              children: [
                {
                  displayName: 'Create Enterprise UIs',
                  iconName: 'star_rate',
                  route: 'material-design'
                }
              ]
            },
            {
              displayName: 'Stephen Fluin',
              iconName: 'person',
              route: 'stephen-fluin',
              children: [
                {
                  displayName: 'What\'s up with the Web?',
                  iconName: 'star_rate',
                  route: 'what-up-web'
                }
              ]
            },
            {
              displayName: 'Mike Brocchi',
              iconName: 'person',
              route: 'mike-brocchi',
              children: [
                {
                  displayName: 'My ally, the CLI',
                  iconName: 'star_rate',
                  route: 'my-ally-cli'
                },
                {
                  displayName: 'Become an Angular Tailor',
                  iconName: 'star_rate',
                  route: 'become-angular-tailer'
                }
              ]
            }
          ]
        },
        {
          displayName: 'Sessions',
          iconName: 'speaker_notes',
          children: [
            {
              displayName: 'Create Enterprise UIs',
              iconName: 'star_rate',
              route: 'material-design'
            },
            {
              displayName: 'What\'s up with the Web?',
              iconName: 'star_rate',
              route: 'what-up-web'
            },
            {
              displayName: 'My ally, the CLI',
              iconName: 'star_rate',
              route: 'my-ally-cli'
            },
            {
              displayName: 'Become an Angular Tailor',
              iconName: 'star_rate',
              route: 'become-angular-tailer'
            }
          ]
        },
        {
          displayName: 'Feedback',
          iconName: 'feedback',
          route: 'feedback'
        }
      ]
    },
    {
      displayName: 'Orlando',
      iconName: 'group',
      children: [
        {
          displayName: 'Speakers',
          iconName: 'group',
          children: [
            {
              displayName: 'Michael Prentice',
              iconName: 'person',
              route: 'michael-prentice',
              children: [
                {
                  displayName: 'Create Enterprise UIs',
                  iconName: 'star_rate',
                  route: 'material-design'
                }
              ]
            },
            {
              displayName: 'Stephen Fluin',
              iconName: 'person',
              route: 'stephen-fluin',
              children: [
                {
                  displayName: 'What\'s up with the Web?',
                  iconName: 'star_rate',
                  route: 'what-up-web'
                }
              ]
            },
            {
              displayName: 'Mike Brocchi',
              iconName: 'person',
              route: 'mike-brocchi',
              children: [
                {
                  displayName: 'My ally, the CLI',
                  iconName: 'star_rate',
                  route: 'my-ally-cli'
                },
                {
                  displayName: 'Become an Angular Tailor',
                  iconName: 'star_rate',
                  route: 'become-angular-tailer'
                }
              ]
            }
          ]
        },
        {
          displayName: 'Sessions',
          iconName: 'speaker_notes',
          children: [
            {
              displayName: 'Create Enterprise UIs',
              iconName: 'star_rate',
              route: 'material-design'
            },
            {
              displayName: 'What\'s up with the Web?',
              iconName: 'star_rate',
              route: 'what-up-web'
            },
            {
              displayName: 'My ally, the CLI',
              iconName: 'star_rate',
              route: 'my-ally-cli'
            },
            {
              displayName: 'Become an Angular Tailor',
              iconName: 'star_rate',
              route: 'become-angular-tailer'
            }
          ]
        },
        {
          displayName: 'Feedback',
          iconName: 'feedback',
          route: 'feedback'
        }
      ]
    },
    {
      displayName: 'Agences',
      disabled: false,
      iconName: 'group',
      children: [
        {
          displayName: 'Déposer une annonce',
          disabled: false,
          iconName: 'group',
          route: 'feedback'
        },
        {
          displayName: 'Mes annonces',
          disabled: false,
          iconName: 'speaker_notes',
          route: 'feedback'
        },
        {
          displayName: 'Mes forfaits',
          disabled: false,
          iconName: 'feedback',
          route: 'feedback'
        }
      ]
    },
    {
      displayName: 'Mes favoris',
      disabled: true,
      iconName: 'group',
      route: 'feedback'
    },
    {
      displayName: 'Acheter',
      disabled: true,
      iconName: 'group',
      route: 'feedback'
    },
    {
      displayName: 'Louer',
      disabled: true,
      iconName: 'group',
      route: 'feedback'
    },
    {
      displayName: 'Mon compte',
      disabled: false,
      iconName: 'group',
      openDialog: true,
      id: 'myAccount'
    }
  ];

  public search = new Search()

  constructor(private router: Router, private service: AppServiceService, private dialog: MatDialog, private globalService: GlobalService) {
    this.geocoder = new google.maps.Geocoder();
    
  }

  ngOnInit() {
    this.preloadData();
  }

  loadPage(page: number) {
      this.page = page;
      this.preloadData();
  }

    preloadData() {
      if (!this.globalService.paramsLocation.firstVisit && !this.globalService.paramsLocation.firstSearch) {
          console.log('ca passe 1');
          Object.keys(this.search).forEach(key => key = null);
          this.getLocation();
          this.globalService.paramsLocation.firstVisit = true;
      } else if (!this.globalService.paramsLocation.firstSearch) {
          console.log('ca passe 2');
          Object.keys(this.search).forEach(key => key = null);
          this.getLocation();
      } else {
          console.log('ca passe 3');
          this.loadData(this.search);
      }
    }

    loadData(search: Search) {
      console.log('LOADDATA is called');
      // this.annonces = this.service.getListProduitImmobilierDTO(this.pageSize, this.page, search);
      // this.annonces = this.annonces.pipe(tap(dtos => {console.log('received the dtos:');console.log(dtos)}));
      this.service.getListProduitImmobilierDTO(this.pageSize, this.page, search).subscribe(
        articles => {this.annonces = articles;
          this.annonces$ = of(articles);
          this.collectionSize = articles[0].collectionSize; console.log('this.annonces'); console.log(this.annonces)},
        (err: HttpErrorResponse) => {
          console.log(err);
        }
      );
    }

    goToDetailsView(annonce: ProduitImmobilierDTO) {
      console.log('goToDetailsView  annonce.id=' + annonce.id);
      this.router.navigate(['/details/' + annonce.id]);
    }

    generateSpaceString(annonce: ProduitImmobilierDTO) {
      let result = ' ';
      let count = 128;
      if (!(annonce.description === null || annonce.description === undefined)) {
        count = count - annonce.description.length - 4;
      }
      for (let i = 0; i < count; i++) {
        result += ' ';
      }
      if (count !== 128) {
        result += annonce.description.substring(0, 127) + '...' + result;
      }
      return result;
    }

    openDialog(event) {
      const element = document.getElementById(event.target.id);
      const jqelement = $(element);
      const position = jqelement.position(); // cache the position
      let bottom = position.top + jqelement.height();
      bottom = '' + bottom;
      const dialogConfig = new MatDialogConfig();
      dialogConfig.disableClose = true;
      dialogConfig.autoFocus = false;
      dialogConfig.position = {
        top:  bottom + 'px',
        right: '0px'
      };
      console.log(dialogConfig);

      const dialogRef = this.dialog.open(UserDialogComponent, dialogConfig);

      // dialogRef.beforeClose().subscribe((result: string) => {
      //   console.log('RIght before close,', result);
      // });
      // dialogRef.afterClosed().subscribe(result => {
      //   console.log('The dialog was closed', result);
      // });
    }

    getLocation() {
        if (navigator.geolocation) {
          navigator.geolocation.getCurrentPosition((position: Position) => {
            if (position) {
              console.log('Latitude: ' + position.coords.latitude +
                'Longitude: ' + position.coords.longitude);
              this.lat = position.coords.latitude;
              this.lng = position.coords.longitude;

              const  latlng = new google.maps.LatLng(this.lat, this.lng);
              this.geocoder.geocode({ location: latlng }, (
                          (results: google.maps.GeocoderResult[], status: google.maps.GeocoderStatus) => {
                          if (status === google.maps.GeocoderStatus.OK) {


                                  if (results[0]) {
                                      console.log('results[0].address_components=');
                                      console.log(results[0].address_components);
                                      this.postalCode = results[0].address_components[6].long_name;
                                      this.search.codePostal = this.postalCode; 
                                      this.loadData(this.search);
                                      console.log('this.postalCode='+this.postalCode);
                                  }
                          }
              }));
            }
          },
            (error: PositionError) => console.log(error));
        } else {
          alert('Geolocation is not supported by this browser.');
        }

    }
}
