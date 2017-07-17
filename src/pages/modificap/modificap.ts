import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { AlertController } from 'ionic-angular';
/**
 * Generated class for the ModificapPage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
@IonicPage()
@Component({
  selector: 'page-modificap',
  templateUrl: 'modificap.html',
})
export class ModificapPage {

  items = [
    'Nome',
    'Cognome',
    'Password',
    'Email',
    'Telefono',
    'città',
    'Data di Nascita'
    
  ];

  itemSelected(item: string) {
    console.log("Selected Item", item);
  }
  constructor(public navCtrl: NavController, public navParams: NavParams, public alertCtrl: AlertController) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad ModificapPage');
  }
  showPrompt(item) {
    let prompt = this.alertCtrl.create({
      title: item,
      message: "Inserisci  " + item,
      inputs: [
        {
          name: item,
          placeholder: item
        },
      ],
      buttons: [
        {
          text: 'Cancel',
          handler: data => {
            console.log('Cancel clicked');
          }
        },
        {
          text: 'Save',
          handler: data => {
            console.log('Saved clicked');
          }
        }
      ]
    });
    prompt.present();
  }


}
