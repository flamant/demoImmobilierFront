import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AppProduitImmobilierDetailsComponent } from './app-produit-immobilier-details.component';

describe('AppProduitImmobilierDetailsComponent', () => {
  let component: AppProduitImmobilierDetailsComponent;
  let fixture: ComponentFixture<AppProduitImmobilierDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AppProduitImmobilierDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AppProduitImmobilierDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
