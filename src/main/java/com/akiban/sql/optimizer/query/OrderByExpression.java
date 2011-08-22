/**
 * Copyright (C) 2011 Akiban Technologies Inc.
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses.
 */

package com.akiban.sql.optimizer.query;

/** A key expression in an ORDER BY clause. */
public class OrderByExpression
{
    private BaseExpression expression;
    private boolean ascending;

    public OrderByExpression(BaseExpression expression, boolean ascending) {
        this.expression = expression;
        this.ascending = ascending;
    }

    public BaseExpression getExpression() {
        return expression;
    }
    public boolean isAscending() {
        return ascending;
    }

    public String toString() {
        if (ascending)
            return expression.toString();
        else
            return expression.toString() + " DESC";
    }
}
