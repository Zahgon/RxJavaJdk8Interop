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

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.stream.*;
import io.reactivex.rxjava3.core.*;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/**
 * Iterator that emits 0 or 1 values from a reactive source of Single, Maybe or Completable.
 *
 * @param <T> the value type
 */
final class ZeroOneIterator<T> extends CountDownLatch implements Iterator<T>, Disposable, MaybeObserver<T>, SingleObserver<T>, CompletableObserver {

    T value;

    Throwable error;

    Disposable d;

    volatile boolean disposed;

    ZeroOneIterator() {
        super(1);
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public T next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void onSubscribe(Disposable d) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void onSuccess(T value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void onError(Throwable e) {
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

    @Override
    public boolean isDisposed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a Stream from an Iterator which also calls dispose() when closed.
     * @param <T> the value type
     * @param it the source iterator
     * @return the new Stream instance
     */
    public static <T> Stream<T> toStream(Iterator<T> it) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
