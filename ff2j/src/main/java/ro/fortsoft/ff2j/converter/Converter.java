/*
 * Copyright 2013 Decebal Suiu
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with
 * the License. You may obtain a copy of the License in the LICENSE file, or at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package ro.fortsoft.ff2j.converter;

/**
 * A converter allows you to transform a string into an object (decoding).
 * 
 * @author Decebal Suiu
 */
public interface Converter<T> {

	/**
	 * Transform a text value into an object. When reading a text file,
     * it can be interesting to perform some operations on some field value. This
     * method can be used to perform such work.
     *
     * @param text
     *            the value to decode
     * @return an object built from the given value
     */
    public T decode(String text);
	
}
