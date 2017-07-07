import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import {App,MenuController} from 'ionic-angular';

//Providers

import {DictionaryService} from '../../modules/dictionary/providers/dictionary.service';


//Types
import {ReorderIndexes} from '../../types';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
  
})
export class HomePage {

  constructor(
  public navCtrl: NavController,
  public app: App, 
  public menu: MenuController,
  public sDictionary: DictionaryService) {
	  
      menu.enable(true);
      
       
      }
      funzione(){
          this.navCtrl.push('LoginPage');
  }

      funzione5(){
          this.navCtrl.push('RicercaPage');}
    
}

 