import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { AlertController } from 'ionic-angular';


@IonicPage()
@Component({
  selector: 'page-prenotazione',
  templateUrl: 'prenotazione.html',
})
export class PrenotazionePage {

  constructor(public navCtrl: NavController, public navParams: NavParams, public alertCtrl: AlertController) {
       
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad PrenotazionePage');
  }

  conferma(){ 
     let confirm = this.alertCtrl.create({
      title: 'Prenota',
      message: 'Sei sicuro di voler prenotare?',
      buttons: [
        {
          text: 'No',
          handler: () => {
            console.log('Disagree clicked');
          }
        },
        {
          text: 'Si',
          handler: () => {
            console.log('Agree clicked');
            this.navCtrl.setRoot('PreferitiPage');
          }
        }
      ]
    });
    confirm.present();
  } 
  }

