/*
 * The MIT License
 *
 * Copyright 2016 link.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 * Created file on 12/7/16 at 12:49 PM.
 *
 * This file is part of Quantum API
 */
package quantum.api.resource;

import quantum.mod.Mod;

/**
 * A skeletal class for Resource implementations.
 *
 * @author link
 */
public abstract class AbstractResource implements Resource {

	/**
	 * The mod that this Resource belongs to
	 */
	protected final Mod mod;

	/**
	 * The path to the physical resource
	 */
	protected final String path;

	/**
	 * Creates a new Resource with the given mod and path.
	 *
	 * @param mod
	 * 		the mod that this Resource belongs to
	 * @param path
	 * 		the path to the physical resource
	 */
	protected AbstractResource(Mod mod, String path) {
		this.mod = mod;
		this.path = path;
	}

	@Override
	public final Mod getMod() {
		return mod;
	}

	@Override
	public final String getPath() {
		return path;
	}
}