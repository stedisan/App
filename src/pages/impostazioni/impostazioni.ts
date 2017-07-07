import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';

/**
 * Generated class for the ImpostazioniPage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
 
 //providers
 import {DictionaryService} from '../../modules/dictionary/providers/dictionary.service';

 
@IonicPage()
@Component({
  selector: 'page-impostazioni',
  templateUrl: 'impostazioni.html',
})
export class ImpostazioniPage {

  constructor(
  public navCtrl: NavController, 
  public navParams: NavParams,
  public sDictionary: DictionaryService
  ) {
  }

  funzione(){
          this.navCtrl.push('ModificapPage');
  }
  funzione5(){
      this.navCtrl.push('RicercaPage');
  }

}
