package com.massrelevance.dropwizard.scala.util

import javax.ws.rs.core.MultivaluedMap

import com.sun.jersey.server.impl.model.parameter.multivalued.MultivaluedParameterExtractor

class StringExtractor(parameter: String, defaultValue: String = null) extends MultivaluedParameterExtractor {
  def getName: String = parameter

  def getDefaultStringValue: String = defaultValue

  def extract(parameters: MultivaluedMap[String, String]): AnyRef = {
    val value = parameters.getFirst(parameter)
    if (value != null) value else defaultValue
  }
}
