import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppProduitImmobilierDetailsComponent} from './app-produit-immobilier-details/app-produit-immobilier-details.component';
import { AppListProduitImmobilierComponent } from './app-list-produit-immobilier/app-list-produit-immobilier.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: '/listproduitimmobilier',
    pathMatch: 'full' 
  },
  {
    path: 'listproduitimmobilier',
    component: AppListProduitImmobilierComponent
  },
  {
    path: 'details/:id',
    component: AppProduitImmobilierDetailsComponent
  }
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes,
      { enableTracing: false })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
