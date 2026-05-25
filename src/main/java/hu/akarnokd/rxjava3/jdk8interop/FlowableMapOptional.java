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

import java.util.Optional;
import org.reactivestreams.*;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.*;

/**
 * Maps an upstream value into an Optional and emits its value if not empty.
 *
 * @param <T> the upstream value type
 * @param <R> the result value type
 */
final class FlowableMapOptional<T, R> extends Flowable<R> {

    final Publisher<T> source;

    final Function<? super T, Optional<R>> mapper;

    FlowableMapOptional(Publisher<T> source, Function<? super T, Optional<R>> mapper) {
        this.source = source;
        this.mapper = mapper;
    }

    @Override
    protected void subscribeActual(Subscriber<? super R> s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static final class MapOptionalSubscriber<T, R> extends BasicFuseableSubscriber<T, R> implements ConditionalSubscriber<T> {

        final Function<? super T, Optional<R>> mapper;

        public MapOptionalSubscriber(Subscriber<? super R> actual, Function<? super T, Optional<R>> mapper) {
            super(actual);
            this.mapper = mapper;
        }

        @Override
        public void onNext(T t) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public boolean tryOnNext(T t) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public int requestFusion(int mode) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public R poll() throws Throwable {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    static final class MapOptionalConditionalSubscriber<T, R> extends BasicFuseableConditionalSubscriber<T, R> implements ConditionalSubscriber<T> {

        final Function<? super T, Optional<R>> mapper;

        public MapOptionalConditionalSubscriber(ConditionalSubscriber<? super R> actual, Function<? super T, Optional<R>> mapper) {
            super(actual);
            this.mapper = mapper;
        }

        @Override
        public void onNext(T t) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public boolean tryOnNext(T t) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public int requestFusion(int mode) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public R poll() throws Throwable {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
