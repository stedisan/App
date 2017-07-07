webpackJsonp([0],{

/***/ 270:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UtentePageModule", function() { return UtentePageModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(38);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__utente__ = __webpack_require__(280);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



var UtentePageModule = (function () {
    function UtentePageModule() {
    }
    return UtentePageModule;
}());
UtentePageModule = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["a" /* NgModule */])({
        declarations: [
            __WEBPACK_IMPORTED_MODULE_2__utente__["a" /* UtentePage */],
        ],
        imports: [
            __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["d" /* IonicPageModule */].forChild(__WEBPACK_IMPORTED_MODULE_2__utente__["a" /* UtentePage */]),
        ],
        exports: [
            __WEBPACK_IMPORTED_MODULE_2__utente__["a" /* UtentePage */]
        ]
    })
], UtentePageModule);

//# sourceMappingURL=utente.module.js.map

/***/ }),

/***/ 280:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return UtentePage; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(38);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__home_home__ = __webpack_require__(98);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var UtentePage = (function () {
    function UtentePage(navCtrl, navParams) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
    }
    UtentePage.prototype.ionViewDidLoad = function () {
        console.log('ionViewDidLoad UtentePage');
    };
    UtentePage.prototype.funz = function () {
        this.navCtrl.push('ImpostazioniPage');
    };
    UtentePage.prototype.funzione5 = function () {
        this.navCtrl.push('RicercaPage');
    };
    UtentePage.prototype.esci = function () {
        this.navCtrl.parent.parent.setRoot(__WEBPACK_IMPORTED_MODULE_2__home_home__["a" /* HomePage */]);
    };
    return UtentePage;
}());
UtentePage = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["e" /* IonicPage */])(),
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_6" /* Component */])({
        selector: 'page-utente',template:/*ion-inline-start:"C:\Users\Marcodav\ionicJS\src\pages\utente\utente.html"*/'\n<ion-header>\n\n  <ion-navbar color="secondary">\n    <ion-title>Profilo</ion-title>\n     <ion-buttons end>\n         <button  ion-button icon-only icon-right (click)="funzione5()"> <ion-icon name="search"></ion-icon></button> </ion-buttons>\n  </ion-navbar>\n\n</ion-header>\n\n\n<ion-content padding>\n    <div class="logo-container">\n                <img src="assets/icon/logo.jpg" alt=""/>\n                <p (click)="funz()"> Modifica immagine </p>\n    </div>    \n<div class="container-form">\n\n        <ion-list>\n            <ion-item>\n                <ion-label stacked> Username:</ion-label>\n            </ion-item>\n            <ion-item>\n                <ion-label stacked>Email:</ion-label>\n            </ion-item>\n            <ion-item>\n                <ion-label stacked>Nome:</ion-label>\n            </ion-item>\n            <ion-item>\n                <ion-label stacked>Cognome:</ion-label>\n            </ion-item>\n             <ion-item>\n                <ion-label stacked>Telefono:</ion-label>\n            </ion-item>\n             <ion-item>\n                <ion-label stacked>Città:</ion-label>\n            </ion-item>\n             <ion-item>\n                <ion-label stacked>Data di nascita:</ion-label>\n            </ion-item>\n        </ion-list>\n</div>\n    <ion-fab right top>\n    <button ion-fab mini color="secondary"><ion-icon name="log-out"></ion-icon></button>\n    <ion-fab-list>\n      <button ion-fab (click)="esci()">logout</button>\n    </ion-fab-list>\n    </ion-fab>\n</ion-content>\n'/*ion-inline-end:"C:\Users\Marcodav\ionicJS\src\pages\utente\utente.html"*/,
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["f" /* NavController */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["f" /* NavController */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["g" /* NavParams */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["g" /* NavParams */]) === "function" && _b || Object])
], UtentePage);

var _a, _b;
//# sourceMappingURL=utente.js.map

/***/ })

});
//# sourceMappingURL=0.main.js.map