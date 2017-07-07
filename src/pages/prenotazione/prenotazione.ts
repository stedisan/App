import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import {App,MenuController} from 'ionic-angular';

//providers
import { DictionaryService } from '../../modules/dictionary/providers/dictionary.service';

@IonicPage()
@Component({
  selector: 'page-prenotazione',
  templateUrl: 'prenotazione.html',
})
export class PrenotazionePage {

  constructor(
  public navCtrl: NavController, 
  public navParams: NavParams, 
  public app: App, 
  public menu: MenuController,
  public sDictionay: DictionaryService
  ) {
      menu.enable(true); 
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad PrenotazionePage');
  }
funzione5(){
          this.navCtrl.push('RicercaPage');
      }
       funzione(){
          this.navCtrl.push('LoginPage');
  }
}
