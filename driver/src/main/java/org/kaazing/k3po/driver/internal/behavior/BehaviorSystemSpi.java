/**
 * Copyright 2007-2015, Kaazing Corporation. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaazing.k3po.driver.internal.behavior;

import java.util.Set;

import org.kaazing.k3po.lang.types.StructuredTypeInfo;
import org.kaazing.k3po.lang.types.TypeInfo;

public interface BehaviorSystemSpi {

    Set<TypeInfo<?>> getReadOptionTypes();

    Set<TypeInfo<?>> getWriteOptionTypes();

    ReadOptionFactory readOptionFactory(TypeInfo<?> optionType);

    WriteOptionFactory writeOptionFactory(TypeInfo<?> optionType);

    Set<StructuredTypeInfo> getReadConfigTypes();

    Set<StructuredTypeInfo> getWriteConfigTypes();

    ReadConfigFactory readConfigFactory(StructuredTypeInfo configType);

    WriteConfigFactory writeConfigFactory(StructuredTypeInfo configType);

    Set<StructuredTypeInfo> getReadAdvisoryTypes();

    Set<StructuredTypeInfo> getWriteAdvisoryTypes();

    ReadAdviseFactory readAdviseFactory(StructuredTypeInfo advisoryType);

    ReadAdvisedFactory readAdvisedFactory(StructuredTypeInfo advisoryType);

    WriteAdviseFactory writeAdviseFactory(StructuredTypeInfo advisoryType);

    WriteAdvisedFactory writeAdvisedFactory(StructuredTypeInfo advisoryType);

}
