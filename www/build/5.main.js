webpackJsonp([5],{

/***/ 265:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "PrenotazionePageModule", function() { return PrenotazionePageModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(38);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__prenotazione__ = __webpack_require__(275);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



var PrenotazionePageModule = (function () {
    function PrenotazionePageModule() {
    }
    return PrenotazionePageModule;
}());
PrenotazionePageModule = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["a" /* NgModule */])({
        declarations: [
            __WEBPACK_IMPORTED_MODULE_2__prenotazione__["a" /* PrenotazionePage */],
        ],
        imports: [
            __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["d" /* IonicPageModule */].forChild(__WEBPACK_IMPORTED_MODULE_2__prenotazione__["a" /* PrenotazionePage */]),
        ],
        exports: [
            __WEBPACK_IMPORTED_MODULE_2__prenotazione__["a" /* PrenotazionePage */]
        ]
    })
], PrenotazionePageModule);

//# sourceMappingURL=prenotazione.module.js.map

/***/ }),

/***/ 275:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return PrenotazionePage; });
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



var PrenotazionePage = (function () {
    function PrenotazionePage(navCtrl, navParams, app, menu) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
        menu.enable(true);
    }
    PrenotazionePage.prototype.ionViewDidLoad = function () {
        console.log('ionViewDidLoad PrenotazionePage');
    };
    PrenotazionePage.prototype.funzione5 = function () {
        this.navCtrl.push('RicercaPage');
    };
    PrenotazionePage.prototype.funzione = function () {
        this.navCtrl.push('LoginPage');
    };
    return PrenotazionePage;
}());
PrenotazionePage = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["e" /* IonicPage */])(),
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_6" /* Component */])({
        selector: 'page-prenotazione',template:/*ion-inline-start:"C:\Users\Marcodav\ionicJS\src\pages\prenotazione\prenotazione.html"*/'<ion-header>\n    <ion-navbar color="secondary">\n        <ion-title>prenotazione</ion-title>\n    </ion-navbar>\n</ion-header>\n<ion-content>\n    \n</ion-content>'/*ion-inline-end:"C:\Users\Marcodav\ionicJS\src\pages\prenotazione\prenotazione.html"*/,
    }),
    __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["f" /* NavController */], __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["g" /* NavParams */], __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["h" /* App */], __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["i" /* MenuController */]])
], PrenotazionePage);

//# sourceMappingURL=prenotazione.js.map

/***/ })

});
//# sourceMappingURL=5.main.js.map