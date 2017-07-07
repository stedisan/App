import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';

/**
 * Generated class for the PreferitiPage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
 
// providers

import { DictionaryService } from '../../modules/dictionary/providers/dictionary.service';
 
@IonicPage()
@Component({
  selector: 'page-preferiti',
  templateUrl: 'preferiti.html',
})
export class PreferitiPage {

  constructor(
  public navCtrl: NavController, 
  public navParams: NavParams,
  public sDictionary: DictionaryService
  ) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad PreferitiPage');
  }
  funzione(){
      this.navCtrl.push('ProfiloPage');
  }
  funzione5(){
      this.navCtrl.push('RicercaPage');
  }
}
