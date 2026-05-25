/*
 * Copyright 2019 David Karnok
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package hu.akarnokd.rxjava3.jdk8interop;

import java.util.function.*;
import java.util.stream.Collector;
import io.reactivex.rxjava3.core.*;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.*;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/**
 * Collect elements of the upstream with the help of the Collector's callback functions.
 *
 * @param <T> the upstream value type
 * @param <A> the accumulated type
 * @param <R> the result type
 */
final class ObservableCollector<T, A, R> extends Observable<R> {

    final ObservableSource<T> source;

    final Collector<T, A, R> collector;

    ObservableCollector(ObservableSource<T> source, Collector<T, A, R> collector) {
        this.source = source;
        this.collector = collector;
    }

    @Override
    protected void subscribeActual(Observer<? super R> s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static final class CollectorObserver<T, A, R> extends DeferredScalarDisposable<R> implements Observer<T> {

        private static final long serialVersionUID = 2129956429647866524L;

        final BiConsumer<A, T> accumulator;

        final Function<A, R> finisher;

        A intermediate;

        Disposable upstream;

        boolean done;

        public CollectorObserver(Observer<? super R> actual, A initialValue, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            super(actual);
            this.intermediate = initialValue;
            this.accumulator = accumulator;
            this.finisher = finisher;
        }

        @Override
        public void onSubscribe(Disposable d) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void onNext(T t) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void onError(Throwable t) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void onComplete() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void dispose() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
