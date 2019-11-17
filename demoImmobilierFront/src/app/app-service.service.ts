import { Injectable } from '@angular/core';
import {DossierPinelDTO} from './dossier-pinel-dto';
import {ProduitImmobilierDTO} from './produit-immobilier-dto';
import {UserDTO} from './user-dto';
import {Search} from './search';
import { Observable} from 'rxjs';
import { map } from 'rxjs/operators';
import { HttpClient, HttpHeaders, HttpRequest, HttpParams } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AppServiceService {

  constructor(private http: HttpClient) {}

  getDossierPinelDTO(id: number): Observable<DossierPinelDTO> {
    const headerDict = {
      'Content-Type': 'application/json',
      Accept: 'application/json',
      'Access-Control-Allow-Headers': 'Content-Type'
    };

    const requestOptions = {
      headers: new HttpHeaders(headerDict)
    };
    return this.http.get('/api/produitimmobilier/' + id, requestOptions).pipe(map(response => DossierPinelDTO.fromJson(response)));
  }

  getListProduitImmobilierDTO(pagesize: number, page: number, search: Search): Observable<ProduitImmobilierDTO[]> {
    const headers = new HttpHeaders({ 'Content-Type': 'application/json' });
    const options = { headers };
    search.page = page;
    search.pageSize = pagesize;
    // tslint:disable-next-line: no-shadowed-variable
    return this.http.post<Search>('/api/produitimmobilier/all', JSON.stringify(search), options).pipe(map((search: Search) => search.result as ProduitImmobilierDTO[]));
  }

  login(userDTO: UserDTO): Observable<UserDTO> {
    const headerDict = {
      'Content-Type': 'application/json',
      Accept: 'application/json',
      'Access-Control-Allow-Headers': 'Content-Type'
    };

    const requestOptions = {
      headers: new HttpHeaders(headerDict)
    };
    return this.http.post<UserDTO>('/api/user/login', userDTO, requestOptions).pipe(map(response => UserDTO.fromJson(response)));
  }

  save(userDTO: UserDTO): Observable<UserDTO> {
    const headerDict = {
      'Content-Type': 'application/json',
      Accept: 'application/json',
      'Access-Control-Allow-Headers': 'Content-Type'
    };

    const requestOptions = {
      headers: new HttpHeaders(headerDict)
    };
    return this.http.post<UserDTO>('/api/user/save', userDTO, requestOptions).pipe(map(response => UserDTO.fromJson(response)));
  }
}
