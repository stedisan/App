import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import {HomePage} from '../home/home'


@IonicPage()
@Component({
  selector: 'page-user',
  templateUrl: 'user.html',
})
export class UserPage {

  constructor(public navCtrl: NavController, 
  public navParams: NavParams
  ) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad UserPage');
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


