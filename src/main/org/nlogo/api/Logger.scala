package org.nlogo.api

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 8/15/12
 * Time: 5:27 PM
 */

object Logger {
  def logCustomMessage(msg: String, nameValuePairs: (String, String)*) {
    org.nlogo.log.Logger.logCustomMessage(msg, nameValuePairs: _*)
  }
}
