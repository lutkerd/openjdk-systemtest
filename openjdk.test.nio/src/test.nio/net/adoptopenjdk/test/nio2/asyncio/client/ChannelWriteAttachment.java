/*******************************************************************************
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      https://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*******************************************************************************/

package net.adoptopenjdk.test.nio2.asyncio.client;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;

public class ChannelWriteAttachment {
	public AsynchronousSocketChannel channel;
	public ByteBuffer sentBuffer;
	
	ChannelWriteAttachment() {
		channel = null;
		sentBuffer = null;
	}
}
