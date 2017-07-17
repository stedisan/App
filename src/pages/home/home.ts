import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';


@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
  
})
export class HomePage {

  constructor(public navCtrl: NavController) {
      
      
      }
      funzione(){
          this.navCtrl.push('LoginPage');
  }

      funzione5(){
          this.navCtrl.push('RicercaPage');}
    
}

 