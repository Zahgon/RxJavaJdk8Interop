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
import java.util.concurrent.atomic.*;
import java.util.stream.Stream;
import org.reactivestreams.*;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.subscriptions.*;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/**
 * Consume a {@link Stream} and close it when the sequence is done
 * or gets disposed.
 * @since 0.3.4
 */
final class FlowableFromStream<T> extends Flowable<T> {

    final Stream<T> stream;

    FlowableFromStream(Stream<T> stream) {
        this.stream = stream;
    }

    @Override
    protected void subscribeActual(Subscriber<? super T> s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static final class StreamSubscription<T> extends AtomicInteger implements Subscription {

        private static final long serialVersionUID = 497982641532135424L;

        final Subscriber<? super T> downstream;

        AutoCloseable stream;

        Iterator<T> iterator;

        final AtomicLong requested;

        StreamSubscription(Subscriber<? super T> downstream, AutoCloseable stream, Iterator<T> iterator) {
            this.downstream = downstream;
            this.stream = stream;
            this.iterator = iterator;
            this.requested = new AtomicLong();
        }

        @Override
        public void request(long n) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        void run(long requested) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        void close() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void cancel() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
