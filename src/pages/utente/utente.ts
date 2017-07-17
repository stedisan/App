import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import {HomePage} from '../home/home'


@IonicPage()
@Component({
  selector: 'page-utente',
  templateUrl: 'utente.html',
})
export class UtentePage {

  constructor(public navCtrl: NavController, public navParams: NavParams) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad UtentePage');
  }
  funz(){
      this.navCtrl.push('ImpostazioniPage');
      
  }
  funzione5(){
      this.navCtrl.push('RicercaPage');
  }
  esci(){
      this.navCtrl.parent.parent.setRoot(HomePage);
       
      }
  }


