using System;
using Microsoft.EntityFrameworkCore;
using TestASP.Models.Entity;

namespace TestASP.Data
{
	public class DbContextMain : DbContext
    {
		public DbContextMain(DbContextOptions<DbContext> options): base(options)
		{

		}
		public DbSet<User> Users { get; set; }
	}
}

