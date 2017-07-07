import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';

/**
 * Generated class for the RicercaPage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
 
//providers
import {DictionaryService} from '../../modules/dictionary/providers/dictionary.service';
 
@IonicPage()
@Component({
  selector: 'page-ricerca',
  templateUrl: 'ricerca.html',
})
export class RicercaPage {

  constructor(
  public navCtrl: NavController, 
  public navParams: NavParams,
  public sDictionary: DictionaryService
  ) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad RicercaPage');
  }

}
