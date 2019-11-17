import { Injectable } from '@angular/core';
import { Display } from './display';

@Injectable({
  providedIn: 'root'
})
export class GlobalService {

  public paramsLocation = new Display(false,false); 

  constructor() { }

}
