import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {CommonModule} from '@angular/common';
import { AppRoutingModule } from './app-routing.module';
import { MaterialModule } from './material/material.module';
import { FlexLayoutModule } from '@angular/flex-layout';
import { HttpClientModule } from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppComponent } from './app.component';
import { VariablesGlobales } from './variablesGlobales';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppProduitImmobilierDetailsComponent } from './app-produit-immobilier-details/app-produit-immobilier-details.component';
import {enableProdMode} from '@angular/core';
import 'hammerjs';
import { AppListProduitImmobilierComponent } from './app-list-produit-immobilier/app-list-produit-immobilier.component';
import { registerLocaleData } from '@angular/common';
import localeFr from '@angular/common/locales/fr';
import { UserDialogComponent } from './user-dialog/user-dialog.component';
import { MenuItemComponent } from './menu-item/menu-item.component';


registerLocaleData(localeFr, 'fr');
enableProdMode();
declare var $: any;
console.log(`jQuery version: ${$.fn.jquery}`);

@NgModule({
  declarations: [
    AppComponent,
    AppProduitImmobilierDetailsComponent,
    AppListProduitImmobilierComponent,
    UserDialogComponent,
    MenuItemComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    FlexLayoutModule,
    CommonModule,
    NgbModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [VariablesGlobales],
  bootstrap: [AppComponent],
  entryComponents: [UserDialogComponent]
})
export class AppModule { }
