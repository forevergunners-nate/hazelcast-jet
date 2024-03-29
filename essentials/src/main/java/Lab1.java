/*
 * Copyright (c) 2008-2019, Hazelcast, Inc. All Rights Reserved.
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

import com.hazelcast.jet.Jet;
import com.hazelcast.jet.JetInstance;
import com.hazelcast.jet.pipeline.Pipeline;

public class Lab1 {

    public static void main (String[] args) {
        Pipeline p = buildPipeline();

        JetInstance jet = Jet.newJetInstance();

        try {
            jet.newJob(p).join();
        } finally {
            jet.shutdown();
        }
    }

    private static Pipeline buildPipeline() {
        Pipeline p = Pipeline.create();

        // DEFINE THE DATA Directory and create an empty text file in it.
        // New lines added to this file will be our source data
        final String DIRECTORY = "data/";

        // STEP 1:
        // Draw using file watcher from the com.hazelcast.jet.pipeline.Sources source library
        // Hint: it's non-timestamped stream

        // Drain to logger using the sink from the library com.hazelcast.jet.pipeline.Sinks;

        // Run this pipeline to test it!

        // STEP 2:
        // Filter out all lines which are not equal to the string "hello"
        // Add text lines to the file.
        // Use echo -- some text editors create a new file for every save. That results in replaying the file.
        //
        // echo "hello" >> filename.txt
        // echo "hello world" >> filename.txt

        return p;
    }
}
