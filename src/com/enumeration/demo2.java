/*
package com.enumeration;


public final class CheckIsDescendantRoleUtil {

    private static boolean isDescendant = false;

    private CheckIsDescendantRoleUtil() {

        throw new IllegalStateException("Utility class can not be instantiated.");
    }

    public static void checkDescendantRole(String ancestorRole,
                                           Map<String, List<Object>> businessRoleHierarchyRepository,
                                           IDescendantResourcesResponseDM descendantResourcesResponseDM,
                                           String descendantRole) {

        extractFlatRoles(ancestorRole, businessRoleHierarchyRepository, descendantResourcesResponseDM, descendantRole);
    }

    private static void extractFlatRoles(String ancestorRole,
                                         Map<String, List<Object>> businessRoleHierarchyRepository,
                                         IDescendantResourcesResponseDM descendantResourcesResponseDM,
                                         String descendantRole) {

        if (ancestorRole != null && !StringUtils.isEmpty(ancestorRole)) {
            if (businessRoleHierarchyRepository.containsKey(ancestorRole)) {

                List<Object> subRolesList = businessRoleHierarchyRepository.get(ancestorRole);
                if (subRolesList.contains(descendantRole)) {
                    descendantResourcesResponseDM.setIsDescendant(Boolean.TRUE);
                    return;
                }
                addSubRolesToFlatRolesListRecursion(subRolesList, descendantRole);
                descendantResourcesResponseDM.setIsDescendant(isDescendant);

                if (!isDescendant) {
                    descendantResourcesResponseDM.setErrorMessage(
                            String.format("Descendant role [%s] is not present in Ancestor Role [%s] Hierarchy", descendantRole,
                                    ancestorRole));
                }
            }
            else {
                descendantResourcesResponseDM.setIsDescendant(Boolean.FALSE);
                descendantResourcesResponseDM.setErrorMessage(
                        String.format("Ancestor role [%s] is not present in Business Roles Hierarchy", ancestorRole));
            }
        }
    }

    private static void addSubRolesToFlatRolesListRecursion(
            List<Object> subRolesList, String descendantRole) {

        for (Object object : subRolesList) {
            if (object instanceof List) {
                List<String> descendantRoleList = (List<String>) object;
                if (descendantRoleList.contains(descendantRole)) {
                    isDescendant = true;
                    return;
                }

                addSubRolesToFlatRolesListRecursion((List<Object>) object, descendantRole);
            }
            else if (object instanceof Map) {
                addSubRoleMapToFlatRolesListRecursion((Map<?, ?>) object, descendantRole);
            }
        }
    }

    private static void addSubRoleMapToFlatRolesListRecursion(Map<?, ?> object,
                                                              String descendantRole) {

        for (Map.Entry<?, ?> entry : object.entrySet()) {
            if (entry.getKey().equals(descendantRole)) {
                isDescendant = true;
                return;
            }
            if (entry.getValue() instanceof List) {
                addSubRolesToFlatRolesListRecursion((List<Object>) entry.getValue(), descendantRole);
            }
            else if (entry.getValue() instanceof Map) {
                if (entry.getKey().equals(descendantRole)) {
                    isDescendant = true;
                    return;
                }
                addSubRoleMapToFlatRolesListRecursion(object, descendantRole);
            }

        }
    }

    public static void reset(){
        isDescendant = false;
    }

}
*/
