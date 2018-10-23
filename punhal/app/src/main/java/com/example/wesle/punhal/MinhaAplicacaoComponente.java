package com.example.wesle.punhal;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

//Este componente é responsável por injetar a classe Application

//Na anotação @Component, são especificados os módulos que são usados ​​para criar a implementação
//do componente. Embora façamos referência ao nosso ActivityModule para injetar atividades,
//também fazemos referência ao AndroidInjectionModule, que é necessário para garantir a
//vinculação dos tipos de base do Android (Atividades, Fragmentos, etc.).
@Component(modules = {AndroidInjectionModule.class,MinhaAplicacaoModule.class})
interface MinhaAplicacaoComponente extends AndroidInjector<MinhaAplicacao> {
}
