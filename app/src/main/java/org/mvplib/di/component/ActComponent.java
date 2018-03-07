package org.mvplib.di.component;

import org.mvplib.view.ui.MainActivity;
import org.mvplib.di.module.ActModule;
import org.mvplib.di.scopes.ActScope;

import dagger.Component;

/**
 * Author: ws.
 * Date: 2018/3/7.
 * Description: //TODO
 */
@ActScope
@Component(modules = ActModule.class,dependencies = ApiComponent.class)
public interface ActComponent {
    void inject(MainActivity activity);
}
