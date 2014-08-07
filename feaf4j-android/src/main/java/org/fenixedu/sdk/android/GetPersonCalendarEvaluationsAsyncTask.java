package org.fenixedu.sdk.android;

import org.fenixedu.sdk.Authorization;
import org.fenixedu.sdk.FenixEduClient;
import org.fenixedu.sdk.domain.CalendarFormat;

import com.google.gson.JsonObject;

/**
 * This endpoint returns the students's evaluations information.
 * This information can be retrieved both in iCalendar and JSON formats.
 */
public class GetPersonCalendarEvaluationsAsyncTask extends AuthorizedFenixEduAsyncTask<CalendarFormat, JsonObject> {

    public GetPersonCalendarEvaluationsAsyncTask(FenixEduClient client, Authorization authorization) {
        super(client, authorization);
    }

    public GetPersonCalendarEvaluationsAsyncTask(FenixEduClient client, PostExecuteCallback postExecuteCallback,
            Authorization authorization) {
        super(client, postExecuteCallback, authorization);
    }

    @Override
    protected JsonObject executeInBackground(CalendarFormat... params) {
        return getClient().getPersonCalendarEvaluations(getAuthorization(), params[0]);
    }
}
