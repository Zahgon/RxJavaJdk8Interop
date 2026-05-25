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

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
import io.reactivex.rxjava3.core.*;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/**
 * Consume a {@link Stream} and close it when the sequence is done
 * or gets disposed.
 * @since 0.3.4
 */
final class ObservableFromStream<T> extends Observable<T> {

    final Stream<T> stream;

    ObservableFromStream(Stream<T> stream) {
        this.stream = stream;
    }

    @Override
    protected void subscribeActual(Observer<? super T> observer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static final class StreamDisposable<T> extends AtomicInteger implements Disposable {

        private static final long serialVersionUID = -7262727127695950226L;

        final Observer<? super T> downstream;

        AutoCloseable stream;

        volatile Iterator<T> iterator;

        StreamDisposable(Observer<? super T> downstream, AutoCloseable stream, Iterator<T> iterator) {
            this.downstream = downstream;
            this.stream = stream;
            this.iterator = iterator;
        }

        void run() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        void close() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void dispose() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public boolean isDisposed() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
