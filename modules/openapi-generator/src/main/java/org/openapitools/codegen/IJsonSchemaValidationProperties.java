package org.openapitools.codegen;

import java.util.List;

public interface IJsonSchemaValidationProperties {
    String getPattern();

    void setPattern(String pattern);

    String getMaximum();

    void setMaximum(String maximum);

    String getMinimum();

    void setMinimum(String minimum);

    boolean getExclusiveMaximum();

    void setExclusiveMaximum(boolean exclusiveMaximum);

    boolean getExclusiveMinimum();

    void setExclusiveMinimum(boolean exclusiveMinimum);

    Integer getMinLength();

    void setMinLength(Integer minLength);

    Integer getMaxLength();

    void setMaxLength(Integer maxLength);

    Integer getMinItems();

    void setMinItems(Integer minItems);

    Integer getMaxItems();

    void setMaxItems(Integer maxItems);

    boolean getUniqueItems();

    void setUniqueItems(boolean uniqueItems);

    Integer getMinProperties();

    void setMinProperties(Integer minProperties);

    Integer getMaxProperties();

    void setMaxProperties(Integer maxProperties);

    Number getMultipleOf();

    void setMultipleOf(Number multipleOf);

    CodegenProperty getItems();

    void setItems(CodegenProperty items);

    boolean getIsModel();

    void setIsModel(boolean isModel);

    boolean getIsDate();

    void setIsDate(boolean isDate);

    boolean getIsDateTime();

    void setIsDateTime(boolean isDateTime);

    boolean getIsMap();

    void setIsMap(boolean isMap);

    boolean getIsArray();

    void setIsArray(boolean isArray);

    CodegenProperty getAdditionalProperties();

    void setAdditionalProperties(CodegenProperty additionalProperties);

    List<CodegenProperty> getVars();

    void setVars(List<CodegenProperty> vars);

    List<CodegenProperty> getRequiredVars();

    void setRequiredVars(List<CodegenProperty> requiredVars);
}
