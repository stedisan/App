webpackJsonp([9],{

/***/ 261:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ImpostazioniPageModule", function() { return ImpostazioniPageModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(38);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__impostazioni__ = __webpack_require__(271);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



var ImpostazioniPageModule = (function () {
    function ImpostazioniPageModule() {
    }
    return ImpostazioniPageModule;
}());
ImpostazioniPageModule = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["a" /* NgModule */])({
        declarations: [
            __WEBPACK_IMPORTED_MODULE_2__impostazioni__["a" /* ImpostazioniPage */],
        ],
        imports: [
            __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["d" /* IonicPageModule */].forChild(__WEBPACK_IMPORTED_MODULE_2__impostazioni__["a" /* ImpostazioniPage */]),
        ],
        exports: [
            __WEBPACK_IMPORTED_MODULE_2__impostazioni__["a" /* ImpostazioniPage */]
        ]
    })
], ImpostazioniPageModule);

//# sourceMappingURL=impostazioni.module.js.map

/***/ }),

/***/ 271:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ImpostazioniPage; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(38);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


/**
 * Generated class for the ImpostazioniPage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
var ImpostazioniPage = (function () {
    function ImpostazioniPage(navCtrl, navParams) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
    }
    ImpostazioniPage.prototype.funzione = function () {
        this.navCtrl.push('ModificapPage');
    };
    ImpostazioniPage.prototype.funzione5 = function () {
        this.navCtrl.push('RicercaPage');
    };
    return ImpostazioniPage;
}());
ImpostazioniPage = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["e" /* IonicPage */])(),
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_6" /* Component */])({
        selector: 'page-impostazioni',template:/*ion-inline-start:"C:\Users\Marcodav\ionicJS\src\pages\impostazioni\impostazioni.html"*/'<ion-header>\n\n  <ion-navbar color="secondary">\n    <ion-title>Impostazioni</ion-title>\n     <ion-buttons end>\n         <button  ion-button icon-only icon-right (click)="funzione5()"> <ion-icon md="md-search"></ion-icon></button> </ion-buttons>\n  </ion-navbar>\n\n</ion-header>\n\n\n<ion-content padding>\n <ion-list>\n  <ion-list-header>Impostazioni profilo</ion-list-header>\n  <ion-item (click)="funzione()"> Modifica Profilo  </ion-item>\n   <ion-item>Elimina Profilo</ion-item>\n   <ion-list-header> Notifiche </ion-list-header>\n   <ion-item>\n       <ion-toggle checked="false"></ion-toggle>\n      <ion-label>\n        Recensioni\n      </ion-label>\n   </ion-item>\n       <ion-item>\n       <ion-toggle checked="true"></ion-toggle>\n      <ion-label>\n        Appuntamenti\n      </ion-label>\n       </ion-item>\n   </ion-list>\n</ion-content>\n'/*ion-inline-end:"C:\Users\Marcodav\ionicJS\src\pages\impostazioni\impostazioni.html"*/,
    }),
    __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["f" /* NavController */], __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["g" /* NavParams */]])
], ImpostazioniPage);

//# sourceMappingURL=impostazioni.js.map

/***/ })

});
//# sourceMappingURL=9.main.js.map