/*
 * Copyright 2011-2022 GatlingCorp (https://gatling.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.gatling.http.client.body;

import java.nio.charset.Charset;

public interface RequestBodyBuilder {

  RequestBody build(String contentType, Charset charset, Charset defaultCharset);

  abstract class Base<T> implements RequestBodyBuilder {

    protected final T content;

    public Base(T content) {
      this.content = content;
    }
  }
}
