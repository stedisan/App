import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';

/**
 * Generated class for the ProfiloPage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
@IonicPage()
@Component({
  selector: 'page-profilo',
  templateUrl: 'profilo.html',
})
export class ProfiloPage {

  constructor(public navCtrl: NavController, public navParams: NavParams,) {
      
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad ProfiloPage');
  }
  funzione4(){
      this.navCtrl.push('PrenotazionePage');
  }
  funzione5(){
      this.navCtrl.push('RicercaPage');
  }
    
  
}
