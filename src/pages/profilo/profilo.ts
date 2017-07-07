import { Component } from '@angular/core';
import { IonicPage, App, NavController, NavParams, AlertController, LoadingController } from 'ionic-angular';

/**
 * Generated class for the ProfiloPage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
 
 //Providers
import {AccountProvider} from '../../providers/account.provider';
import {DictionaryService} from '../../modules/dictionary/providers/dictionary.service';

//Models
import {User} from '../../models/user.model';

import {Language} from '../../modules/dictionary/types';


@IonicPage()
@Component({
  selector: 'page-profilo',
  templateUrl: 'profilo.html',
})
export class ProfiloPage {

	user: User;
    editable: boolean = false;
    languages: Language[] = [];
    preferredLanguage: string = "";

  constructor(
  public navCtrl: NavController, 
  public navParams: NavParams,
  public alertCtrl: AlertController,
  public loadingCtrl: LoadingController,
  public sAccount: AccountProvider,
  public sDictionary: DictionaryService
  ) {
      this.user = this.sAccount.getUser();
        
        this.languages = this.sDictionary.getLanguages();
        this.preferredLanguage = this.sDictionary.getPreferredLanguage();
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
    
	onChangeLanguage() {
        const loading = this.loadingCtrl.create({content: this.sDictionary.get("LOADING_WAITING") });
        loading.present();
        
        this.sDictionary.setPreferredLanguage(this.preferredLanguage)
            .then(() => {
                loading.dismiss().then(() => {
                    this.app.getRootNav().setRoot('TabsPage');
                });
            })
            .catch(() => {
                console.log("Errore nel caricamento del dizionario");
                loading.dismiss();
            });
    }
    
    save() {
        const loading = this.loadingCtrl.create({content: this.sDictionary.get("LOADING_WAITING") });
        loading.present();

        this.sAccount.update()
            .then(() => {
                loading.dismiss().then(() => {
                    this.editable = false;
                });
            })
            .catch((msg) => {
                loading.dismiss().then(() => {
                    this.alertCtrl.create({
                        title: this.sDictionary.get("APP_NAME"),
                        message: msg,
                        buttons: [this.sDictionary.get("OK")] 
                    }).present();
                });
            });
    }

    logout() {
        this.alertCtrl.create({
            title: this.sDictionary.get("APP_NAME"),
            message: this.sDictionary.get("CONFIRM_LOGUOT"),
            buttons: [this.sDictionary.get("NO"), {
                text: this.sDictionary.get("SI"),
                handler: () => {
                    const loading = this.loadingCtrl.create({content: this.sDictionary.get("LOADING_WAITING")});
                    loading.present();

                    this.sAccount.logout()
                        .then(() => {
                            loading.dismiss().then(() => {
                                this.app.getRootNav().setRoot('LoginPage');
                            });
                        })
                        .catch(() => {

                        });
                }
            }]
        }).present();
    }
  
}
