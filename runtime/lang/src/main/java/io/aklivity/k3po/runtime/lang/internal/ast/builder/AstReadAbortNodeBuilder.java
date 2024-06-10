/*
 * Copyright 2024 Aklivity Inc.
 *
 * Aklivity licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.aklivity.k3po.runtime.lang.internal.ast.builder;

import io.aklivity.k3po.runtime.lang.internal.ast.AstReadAbortNode;
import io.aklivity.k3po.runtime.lang.internal.ast.AstStreamNode;

public class AstReadAbortNodeBuilder extends AbstractAstStreamableNodeBuilder<AstReadAbortNode, AstReadAbortNode> {

    public AstReadAbortNodeBuilder() {
        this(new AstReadAbortNode());
    }

    @Override
    public AstReadAbortNode done() {
        return result;
    }

    private AstReadAbortNodeBuilder(AstReadAbortNode node) {
        super(node, node);
    }

    public static class StreamNested<R extends AbstractAstNodeBuilder<? extends AstStreamNode, ?>> extends
            AbstractAstStreamableNodeBuilder<AstReadAbortNode, R> {

        public StreamNested(R builder) {
            super(new AstReadAbortNode(), builder);
        }

        @Override
        public R done() {
            AstStreamNode streamNode = result.node;
            streamNode.getStreamables().add(node);
            return result;
        }

    }
}
