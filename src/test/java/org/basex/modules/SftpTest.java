package org.basex.modules;

import org.basex.core.*;
import org.basex.query.*;

/**
 * SFTP test class.
 *
 * @author BaseX Team 2005-12, BSD License
 * @author Christian Gruen
 */
public final class SftpTest extends QueryModule {
  /**
   * Test method.
   * @param args ignored
   * @throws Exception exception
   */
  public static void main(final String[] args) throws Exception {
    testJava();
    testXQuery();
  }

  /**
   * Java test method.
   */
  public static void testJava() {
    new Sftp();
  }

  /**
   * Java XQuery test method.
   * @throws Exception exception
   */
  public static void testXQuery() throws Exception {
    final Context ctx = new Context();
    String query =
      "import module namespace sftp = 'org.basex.modules.sftp'; " +
      "()";
    System.out.println(new QueryProcessor(query, ctx).value().serialize());
  }
}
