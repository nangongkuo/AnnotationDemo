package com.zjf.annotation_api;

import com.zjf.annotation_api.finder.Finder;

public interface Injector<T> {

    void inject(T host, Object source, Finder finder);
}
