/*
 * Copyright 2010-2015 JetBrains s.r.o.
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

package org.jetbrains.kotlin.checkers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/testsWithJava8")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JetDiagnosticsWithJava8TestGenerated extends AbstractJetDiagnosticsWithFullJdkTest {
    public void testAllFilesPresentInTestsWithJava8() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithJava8"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("compiler/testData/diagnostics/testsWithJava8/annotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Annotations extends AbstractJetDiagnosticsWithFullJdkTest {
        public void testAllFilesPresentInAnnotations() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithJava8/annotations"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("deprecatedRepeatable.kt")
        public void testDeprecatedRepeatable() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/annotations/deprecatedRepeatable.kt");
            doTest(fileName);
        }

        @TestMetadata("javaRepeatable.kt")
        public void testJavaRepeatable() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/annotations/javaRepeatable.kt");
            doTest(fileName);
        }

        @TestMetadata("javaRepeatableRetention.kt")
        public void testJavaRepeatableRetention() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/annotations/javaRepeatableRetention.kt");
            doTest(fileName);
        }

        @TestMetadata("javaUnrepeatable.kt")
        public void testJavaUnrepeatable() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/annotations/javaUnrepeatable.kt");
            doTest(fileName);
        }
    }
}
