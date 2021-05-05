package org.fenixedu.sdk.api;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public interface PublicResources {

    JsonObject getAbout();

    JsonObject getDomainModel();

    JsonObject getAcademicTerms();

    JsonArray getCanteen();

    JsonArray getCanteen(String day);

    JsonArray getContacts();

    JsonObject getCourse(String courseId);

    JsonArray getCourseEvaluations(String courseId);

    JsonArray getCourseGroups(String courseId);

    JsonObject getCourseSchedule(String courseId);

    JsonObject getCourseStudents(String courseId);

    JsonArray getDegrees();

    JsonArray getDegrees(String academicTerm);

    JsonObject getDegree(String degreeId);

    JsonObject getDegree(String degreeId, String academicTerm);

    JsonArray getDegreeCourses(String degreeId);

    JsonArray getDegreeCourses(String degreeId, String academicTerm);

    JsonArray getDegreeCurricularGroups(String degreeId);

    JsonArray getDegreeCurricularGroups(String degreeId, String academicTerm);

    JsonObject getParking();

    JsonObject getShuttle();

    JsonArray getSpaces();

    JsonObject getSpace(String spaceId);

    JsonObject getSpace(String spaceId, String day);

    byte[] getSpaceBlueprint(String spaceId);
}
