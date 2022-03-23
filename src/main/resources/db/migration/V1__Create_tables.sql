CREATE TABLE IF NOT EXISTS pools (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    name VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS pool_options (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    pool_id UUID NOT NULL REFERENCES pools(id),
    option_order INTEGER NOT NULL,
    name VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS users (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR NOT NULL,
    password VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS pool_responses (
    pool_id UUID NOT NULL REFERENCES pools(id),
    option_id UUID NOT NULL REFERENCES pool_options(id),
    author_id UUID NULL REFERENCES users(id)
);