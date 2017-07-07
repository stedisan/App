webpackJsonp([4],{

/***/ 266:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ProfiloPageModule", function() { return ProfiloPageModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(38);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__profilo__ = __webpack_require__(276);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



var ProfiloPageModule = (function () {
    function ProfiloPageModule() {
    }
    return ProfiloPageModule;
}());
ProfiloPageModule = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["a" /* NgModule */])({
        declarations: [
            __WEBPACK_IMPORTED_MODULE_2__profilo__["a" /* ProfiloPage */],
        ],
        imports: [
            __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["d" /* IonicPageModule */].forChild(__WEBPACK_IMPORTED_MODULE_2__profilo__["a" /* ProfiloPage */]),
        ],
        exports: [
            __WEBPACK_IMPORTED_MODULE_2__profilo__["a" /* ProfiloPage */]
        ]
    })
], ProfiloPageModule);

//# sourceMappingURL=profilo.module.js.map

/***/ }),

/***/ 276:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ProfiloPage; });
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
 * Generated class for the ProfiloPage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
var ProfiloPage = (function () {
    function ProfiloPage(navCtrl, navParams) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
    }
    ProfiloPage.prototype.ionViewDidLoad = function () {
        console.log('ionViewDidLoad ProfiloPage');
    };
    ProfiloPage.prototype.funzione4 = function () {
        this.navCtrl.push('PrenotazionePage');
    };
    ProfiloPage.prototype.funzione5 = function () {
        this.navCtrl.push('RicercaPage');
    };
    return ProfiloPage;
}());
ProfiloPage = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["e" /* IonicPage */])(),
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_6" /* Component */])({
        selector: 'page-profilo',template:/*ion-inline-start:"C:\Users\Marcodav\ionicJS\src\pages\profilo\profilo.html"*/'<ion-header>\n\n  <ion-navbar color="secondary">\n      <ion-title>JobService</ion-title> \n         \n    \n       <ion-buttons end>\n           \n            <button  ion-button icon-only icon-right> <ion-icon md="md-heart-outline"> </ion-icon></button>\n\n            <button  ion-button icon-only icon-right (click)="funzione5()"> <ion-icon md="md-search"></ion-icon></button>\n        </ion-buttons>\n    \n  </ion-navbar>\n</ion-header>\n       \n\n    <img src="assets/icon/logo.jpg" alt=""/>\n\n<ion-content>\n    <div class="logo-container">\n                <img src="assets/icon/logo.jpg" alt=""/>\n    </div>\n    <ion-card>\n  <ion-card-header>\n    Descrizione profilo:\n  </ion-card-header>\n  <ion-card-content>\n      <ion-list no-lines>\n          <ion-item>Nome:</ion-item>\n          <ion-item>Categoria:</ion-item>\n          <ion-item>Email:</ion-item>\n          <ion-item>Orario di lavoro:</ion-item>\n      </ion-list>\n  </ion-card-content>\n</ion-card>\n    \n    <button ion-button block icon-left color="secondary" (click)="funzione4()"> <ion-icon name="calendar"></ion-icon>PRENOTA</button>\n    <button ion-button block icon-left color="call"> <ion-icon name="call"></ion-icon>CHIAMA</button>\n    <button ion-button block icon-left color="message"> <ion-icon name="mail"> MESSAGGIO</ion-icon></button>\n</ion-content>'/*ion-inline-end:"C:\Users\Marcodav\ionicJS\src\pages\profilo\profilo.html"*/,
    }),
    __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["f" /* NavController */], __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["g" /* NavParams */]])
], ProfiloPage);

//# sourceMappingURL=profilo.js.map

/***/ })

});
//# sourceMappingURL=4.main.js.map