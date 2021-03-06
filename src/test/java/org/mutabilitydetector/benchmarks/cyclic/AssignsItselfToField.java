package org.mutabilitydetector.benchmarks.cyclic;

/*
 * #%L
 * MutabilityDetector
 * %%
 * Copyright (C) 2008 - 2014 Graham Allan
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */



public class AssignsItselfToField {
    private AssignsItselfToField other;

    public AssignsItselfToField(AssignsItselfToField other) {
        this.other = other;
    }
    
    public void assignsItselfInOtherMethod(AssignsItselfToField other) {
        this.other = other;
    }
    
    void assignsFieldOfOtherInstanceOfSelf(AssignsItselfToField other) {
        other.other = this;
        other.other.other = null;
    }
}