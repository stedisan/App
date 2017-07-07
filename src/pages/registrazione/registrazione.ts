import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, AlertController, LoadingController} from 'ionic-angular';

/**
 * Generated class for the RegistrazionePage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
 
//interfaces
import {UserSignupInterface} from '../../interfaces/user-signup.interface';

//Providers
import {AccountProvider} from '../../providers/account.provider';
import {DictionaryService} from '../../modules/dictionary/providers/dictionary.service';
 
@IonicPage()
@Component({
  selector: 'page-registrazione',
  templateUrl: 'registrazione.html',
})
export class RegistrazionePage {
	
	user: UserSignupInterface;

  constructor(
  public navCtrl: NavController, 
  public navParams: NavParams,
  public alertCtrl: AlertController,
  public sAccount: AccountProvider,
  public loadingCtrl: LoadingController,
  public sDictionary: DictionaryService
  
  ) {
	  this.user = {
            username: "",
            password: "",
            nome: "",
            cognome: "",
            email: "",
			città: "",
            telefono: "",
			età: "",
            data di nascita: "",
			
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad RegistrazionePage');
  }
  registrati(){
      console.log('sei registrato');
      this.navCtrl.push('LoginPage');
  }
  
  signup() {
        console.log(this.user);
        
        this._validate().then(() => {
            const loading = this.loadingCtrl.create({content: this.sDictionary.get("LOADING_WAITING") });
            loading.present();
            
            this.sAccount.signup(this.user)
                .then(() => {
                    loading.dismiss().then(() => {
                        const alert = this.alertCtrl.create({
                            title: this.sDictionary.get("APP_NAME"),
                            message: this.sDictionary.get("TEXT_SIGNUP_SUCCESS"),
                            buttons: [this.sDictionary.get("OK")]
                        });
                        alert.present();
                        alert.onDidDismiss(() => {
                            this.navCtrl.pop();
                        });
                    });
                })
                .catch(msg => {
                    loading.dismiss();
                    this.alertCtrl.create({
                        title: this.sDictionary.get("APP_NAME"),
                        message: msg,
                        buttons: [this.sDictionary.get("OK")]
                    }).present();
                });
        }).catch(() => {});
    }
    
    
    
    private _validate() {
        return new Promise((resolve, reject) => {
            let msg = "";
            
            if (this.user.username.trim() === "") {
                msg = this.sDictionary.get("WARNING_SIGNUP_USERNAME_EMPTY");
            } else if (this.user.email.trim() === "") {
                msg = this.sDictionary.get("WARNING_SIGNUP_EMAIL_EMPTY");
            } else if (this.user.password.trim() === "") {
                msg = this.sDictionary.get("WARNING_SIGNUP_PASSWORD_EMPTY");
            }
            
            if (msg !== "") {
                this.alertCtrl.create({
                    title: this.sDictionary.get("APP_NAME"),
                    message: msg,
                    buttons: [this.sDictionary.get("OK")]
                }).present();
                
                reject();
            } else {
                resolve();
            }
        });
    }
}
