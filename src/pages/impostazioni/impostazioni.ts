import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { AlertController } from 'ionic-angular';


@IonicPage()
@Component({
  selector: 'page-impostazioni',
  templateUrl: 'impostazioni.html',
})
export class ImpostazioniPage {

  constructor(public navCtrl: NavController, public navParams: NavParams,  public alertCtrl: AlertController) {
  }

  funzione(){
          this.navCtrl.push('ModificapPage');
  }
  funzione5(){
      this.navCtrl.push('RicercaPage');
  }
  elimina(){
      let confirm = this.alertCtrl.create({
      title: 'Elimina',
      message: 'Sei sicuro di voler eliminare il tuo profilo?',
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
            this.navCtrl.push('ProfiloPage');
          }
        }
      ]
    });
    confirm.present();
  } 
  
}
