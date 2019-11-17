import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AppListProduitImmobilierComponent } from './app-list-produit-immobilier.component';

describe('AppListProduitImmobilierComponent', () => {
  let component: AppListProduitImmobilierComponent;
  let fixture: ComponentFixture<AppListProduitImmobilierComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AppListProduitImmobilierComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AppListProduitImmobilierComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
